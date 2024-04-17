import { useState } from 'react'
import './App.css'

function App() {
  const [number, setnumber] = useState(0)
  const func = (e) => {
    setnumber(e.target.value);
  }
  const fun1 = () => {
    return number * number;
  }
  return (
    <>
      <h2>Square Calculator</h2>
      <div><h3>Enter Number:</h3>
        <input type='number' onChange={func}></input>
        <h3 >Square : {fun1()} </h3>
      </div>
      
    </>
  )
}

export default App
