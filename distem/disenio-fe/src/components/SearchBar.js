import React from 'react';

export default class SearchBar extends React.Component {

	handleChange = e => {
		this.setState({
			[e.target.name]: e.target.value,
		});
	};

	render() {
		return(
			<div className="row pt-4 pl-3 pr-4 pb-2">
      			<div className="col-md-6">
      			<label htmlFor="searchInput">Usuario registrado</label>
      				<div id="searchInput" className="input-group">
      					<div className="input-group-prepend">
      						<span className="input-group-text"><i className="fas fa-search"></i></span>
      					</div>
      					<input id="buscarUsuario"  
      					onChange={this.props.onChange}
      					ref="buscarUsuario" 
      					type="text" 
      					className="form-control" 
      					list="usuarios" 
      					placeholder="search" />
      				</div>
      			</div>
      		</div>
		);
	}

}