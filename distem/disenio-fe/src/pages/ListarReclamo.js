import React from 'react';
import Header from '../components/Header';
import Menu from '../components/Menu';
import Footer from '../components/Footer';
import ListReclamo from '../components/ListReclamo';

export default class ListarReclamo extends React.Component {

	constructor(props) {
		super(props);
		this.state = {}
	}

	render(){
		return(
			<div>
				<Header />
				<Menu />
				<ListReclamo />
				<Footer />
			</div>
		);
	}
}