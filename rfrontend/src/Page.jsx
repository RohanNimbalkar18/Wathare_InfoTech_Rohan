import React from 'react'
import { HOST, SERIES_WIDTH } from './Constants'
import { useQuery } from 'react-query'
import axios from 'axios'

function Page() {
  const [hours, setHours] = React.useState(1);
  const [green, setGreen] = React.useState([]);
  const [dataLength,setDataLength] = React.useState(0)
  const [red, setRed] = React.useState([])
  const [infoTable,setInfoTable] = React.useState(null)
  const { data,isLoading } = useQuery(['data',hours], () => {
    if (hours) {
      return axios.get(HOST+"/generate/"+hours)
    }
    return axios.get(HOST)
  }, {
    onSuccess: (res) => {
      const g = []
      const r = []
      res.data.data.forEach((item, index) => {
        if (item === 1) g.push(index)
        else if (item === 2) r.push(index)
      })
      setGreen(g)
      setRed(r)
      setDataLength(res.data.data.length)
      setInfoTable({
        count0: res.data['0_count'],
        count1: res.data['1_count'],
        max0: res.data['0_max'],
        max1: res.data['1_max']
      })
    }
  })
  return (<>
    {!isLoading ? <><div style={{ display: 'grid', placeItems: 'center', width: '100vw', height: '100vh', alignContent: 'center' }}>
    <div style={{ width: SERIES_WIDTH, display: 'flex', gap: '12px', justifyContent: 'space-between', marginBottom: '24px' }}>
      <div style={{ padding: '8px', paddingLeft: '0' }}>Clock Cycle</div>
      <div style={{ display: 'flex', gap: '12px' }}>
          <div onClick={() => {
            if (!hours) return;
            setHours(null); setGreen([]); setInfoTable(null); setRed([]);
          }} style={{ cursor: 'pointer', padding: '8px', border: 'none', borderRadius: '4px', opacity: hours === null ? 1 : .6, background: hours === null ? 'lightblue' : 'lightgray' }}>Sample Data</div>
          <div onClick={() => { if (hours===1)  return ; setHours(1); setGreen([]); setInfoTable(null);setRed([]); }} style={{ cursor: 'pointer', padding: '8px', border: 'none', borderRadius: '4px', opacity: hours === 1 ? 1 : .6, background: hours === 1 ? 'lightblue' : 'lightgray' }}>1 hr</div>
          <div onClick={() => { if (hours === 8) return; setHours(8);setGreen([]); setInfoTable(null);setRed([]); }} style={{ cursor: 'pointer', padding: '8px', border: 'none', borderRadius: '4px', opacity: hours === 8 ? 1 : .6, background: hours === 8 ? 'lightblue' : 'lightgray' }}>8 hrs</div>
      </div>
    </div>
    <div style={{ position: 'relative', height: '50px', background: 'yellow ',width: SERIES_WIDTH, display: 'flex', borderBottom: '2px solid black',position:'relative' }}>
        {!!green.length && (green).map((item, index) => <div key={Math.random()} style={{ height: '100%', background: 'green', width: SERIES_WIDTH / dataLength, position: 'absolute', left: `${item * 100 / dataLength}%` }} />)}
        {!!red.length && (red).map((item, index) => <div key={Math.random()} style={{ height: '100%', background: 'red', width: SERIES_WIDTH / dataLength, position: 'absolute', left: `${item * 100 / dataLength}%` }} />)} 
        {data && <><div key={'start'} style={{ position: 'absolute', bottom: -30, left: -20 }}>{new Date(data?.data?.start).toLocaleTimeString()}</div>
          <div key={'end'} style={{ position: 'absolute', bottom: -30, right: -20 }}>{new Date(data?.data?.end).toLocaleTimeString()}</div>
        </>}
      </div> 
      <div>{infoTable &&
      <div style={{border:'1px solid lightgray',padding:'12px',display:'flex',flexDirection:'column',marginTop:'50px'}}>
      <div>Number Of  Occurances of 0s : {infoTable.count0 }
     </div> <div>Number Of  Occurances of 1s : {infoTable.count1 }
     </div> <div>  Maximum Continuous Occurance of 0s: {infoTable.max0 }
     </div> <div>  Maximum Continuous Occurance of 1s: {infoTable.max1 }
      </div></div>}
        
        </div>
    </div></> :
      <div style={{ width: '100vw', height: '100vh', display: 'grid', placeItems: 'center' }}><h1>Loading</h1></div>}
  </>
  )
}

export default Page