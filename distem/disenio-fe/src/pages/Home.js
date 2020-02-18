import React from 'react';
import Footer from '../components/Footer.js';
import Header from '../components/Header.js';
import Menu from '../components/Menu.js';
import Content from '../components/Content';

export default class Home extends React.Component{

	render(){
		return(

			<div>
				<Header />
				<Menu />
				<Content />
				<Footer />
			</div>

		);
	}

}
