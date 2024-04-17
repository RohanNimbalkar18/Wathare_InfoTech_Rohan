require('dotenv').config();
const express = require('express')
var cors = require('cors')
var app = express()

app.use(cors())
const mongoose = require('mongoose');
const mongoString = process.env.DATABASE_URL;
const Timeline = require('./model')

mongoose.connect(mongoString);
const database = mongoose.connection;

database.on('error', (error) => {
    console.log(error)
})

database.once('connected', () => {
    console.log('Database Connected');
})

app.use(express.json());

app.listen(3000, () => {
    console.log(`Server Started at ${3000}`)
})

app.get('/', async (_, res) => {
    const data = await Timeline.find({}).limit(7200 * 2)
    const arr = [data[0]];
        for (let i = 1; i < data.length - 1; i++) {
          while (new Date(arr[arr.length - 1].ts).getTime() + 1000 < new Date(data[i].ts).getTime()) {
            arr.push({ ts: new Date(new Date(arr[arr.length - 1].ts).getTime() + 1000), machine_status: 2 })
            break;
          }
          arr.push(data[i])
        }
    arr.push(data[data.length - 1])
    const ret = arr.map(item=>item.machine_status)
    res.json({data:ret,start:new Date(arr[0].ts),end:new Date(data[data.length-1].ts),
        '0_max': calculateMaxContinuousSequence(ret, 0),
        '1_max': calculateMaxContinuousSequence(ret, 1),
        '0_count': countOccurrences(ret, 0),
        '1_count': countOccurrences(ret, 1),})
})

app.get('/generate/:hours', async (req, res) => {
    const hours = req.params.hours;
    const currentTime = new Date().getTime();
    const beforeHours = currentTime - parseInt(hours) * 3600 * 1000
    const arr = generateRandomData((currentTime-beforeHours)/1000)
    const table = {
    }
    res.json({ data: arr, start: new Date(beforeHours), end: new Date(currentTime),
        '0_max': calculateMaxContinuousSequence(arr, 0),
        '1_max': calculateMaxContinuousSequence(arr, 1),
        '0_count': countOccurrences(arr, 0),
        '1_count': countOccurrences(arr, 1), })
})

function generateRandomData(length) {
    const data = [];
    let currentIndex = 0;
  
    while (currentIndex < length) {
      const sequenceLength = Math.floor(Math.random() * 10) + 1; 
      const randomNumber = Math.random(); 
  
      if (randomNumber < 0.8) {
        for (let i = 0; i < sequenceLength && currentIndex < length; i++) {
          data.push(0);
          currentIndex++;
        }
      } else if (randomNumber < 0.99) {
        for (let i = 0; i < sequenceLength && currentIndex < length; i++) {
          data.push(1);
          currentIndex++;
        }
      } else {
        for (let i = 0; i < sequenceLength && currentIndex < length; i++) {
          data.push(2);
          currentIndex++;
        }
      }
    }
    
    return data;
}
  
function countOccurrences(data, number) {
    let count = 0;
  
    for (let i = 0; i < data.length; i++) {
      if (data[i] === number) {
        count++;
      }
    }
  
    return count;
  }

function calculateMaxContinuousSequence(data, number) {
    let maxSequence = 0;
    let currentSequence = 0;
  
    for (let i = 0; i < data.length; i++) {
      if (data[i] === number) {
        currentSequence++;
      } else {
        maxSequence = Math.max(maxSequence, currentSequence);
        currentSequence = 0;
      }
    }
  
    maxSequence = Math.max(maxSequence, currentSequence);
  
    return maxSequence;
  }