import React from 'react';

export default class Footer extends React.Component {

	render(){
		return(
			<div>
				<footer className="main-footer">
				    <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">MaxElec</a>.</strong>
				    All rights reserved.
				    <div className="float-right d-none d-sm-inline-block">
				      <b>Version</b> 3.0.1
				    </div>
				  </footer>
			</div>
		);
	}

}