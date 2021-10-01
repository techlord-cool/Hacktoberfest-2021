import React, { Component } from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
 
// import Home from './components/home';
import privacy from './components/privacy';
import terms from './components/terms';
import home from './components/home'
 
class App extends Component {
  render() {
    return (      
       <BrowserRouter>
        <div>
            <Switch>
             <Route path="/" component={home} exact/>
             <Route path="/privacy" component={privacy}/>
             <Route path="/terms" component={terms}/>
            <Route component={Error}/>
           </Switch>
        </div> 
      </BrowserRouter>
    );
  }
}
 
export default App;