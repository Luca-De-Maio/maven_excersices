import React from 'react';
import Footer from '../components/Footer';
import Header from '../components/Header';
import Menu from '../components/Menu';
import RegistrarReclamoForm from '../components/RegistrarReclamoForm';

export default class RegistrarReclamo extends React.Component{

	render(){
		return(

			<div>
				<Header />
				<Menu />
				<RegistrarReclamoForm />
				<Footer />
			</div>

		);
	}

}
