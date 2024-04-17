import React from 'react';
import './App.css'
import { QueryClient, QueryClientProvider, useQuery } from 'react-query';
import axios from 'axios';
import Page from './Page';
import { HOST } from './Constants';

const queryClient = new QueryClient({
  defaultOptions: {
    queries: {
      refetchInterval: false,
      refetchIntervalInBackground: false,
      refetchOnMount: false,
      refetchOnReconnect: false,
      refetchOnWindowFocus:false
    }
  }
})

function App() {

  return <QueryClientProvider client={queryClient}>  
    <div style={{position:'absolute',top:'20px',left:'20px',fontSize:'12px',display:'flex',flexDirection:'column'}}>
      <div>Rohan Nimbalkar
    </div>  <div>+917588207296
    </div>  <div>CDAC IACSD
    </div>  <div>Shahupuri, Satara
    </div></div>  
    <Page />
  </QueryClientProvider>}

export default App
