import React from 'react';
import Home from '../pages/Home';
import ListarReclamo from '../pages/ListarReclamo';
import RegistrarReclamo from '../pages/RegistrarReclamo';
import { BrowserRouter, Switch, Route, Redirect } from 'react-router-dom';

export default class App extends React.Component{

	render(){
		return(
			<BrowserRouter>
		      <Switch>
		        <Route path="/" exact component={Home} />
		        <Route path="/registrar-reclamo" exact component={RegistrarReclamo} />
		        <Route path="/listar-reclamo" exact component={ListarReclamo} />
		      </Switch>
		    </BrowserRouter>
		);
	}

}
