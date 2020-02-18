import React from 'react';
import Modal from '../components/Modal';
import ApiService from '../ApiService';
import axios from 'axios';

export default class RegistrarReclamoForm extends React.Component {

	handleChange = e => {
	this.setState({
			[e.target.name]: e.target.value,
		});
	console.log(this.props.formValues);
	};

	render(){
		return(
			<div className="content">
		      	<div className="container-fluid">
		      		<div className=" pl-3 pr-5">
		      			<hr width="1000px"/>
		      		</div>
		      		<div className="row pt-4 pl-4 pr-4">
				      	<form onSubmit={this.props.onSubmit}>
						  <div className="form-row">
						    <div className="form-group col-md-4 mb-3">
						      <label htmlFor="validationDefault01">Nombre</label>
						      <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-user"></i></span>
			                    </div>
				                    <input type="text"
				                     value={this.props.formValues.name} 
				                     onChange={this.props.onChange} 
				                     className="form-control" placeholder=""/>
			                  </div>
						    </div>
						    <div className="form-group col-md-4 mb-3">
						      <label htmlFor="validationDefault01">Apellido</label>
						      <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-user"></i></span>
			                    </div>
			                    <input type="text" 
			                    className="form-control" 
			                    value={this.props.formValues.lastName} 
			                    onChange={this.props.onChange} 
			                    placeholder="" disabled/>
			                  </div>
						    </div>
			    			<div className="form-group col-md-4 mb-3">
						      <label htmlFor="validationDefault01">Dni</label>
						      <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-id-card"></i></span>
			                    </div>
			                    <input type="text" 
			                    className="form-control" 
			                    value={this.props.formValues.dni} 
			                    onChange={this.props.onChange} 
			                    placeholder="" disabled />
			                  </div>
						    </div>
						  </div>
						  <div className="form-row">
						    <div className="form-group col-md mb-3">
			                  <label>Telefono</label>
			                  <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-phone"></i></span>
			                    </div>
			                    <input type="text" 
			                    className="form-control" 
			                    value={this.props.formValues.tel} 
			                    onChange={this.props.onChange} 
			                    disabled/>
			                  </div>
			                </div>
			    			<div className="form-group col-md-4 mb-3">
						      <label htmlFor="validationDefault01">Provincia</label>
						      <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-map-marker-alt"></i></span>
			                    </div>
			                    <input id="inputProvincias" 
			                    value={this.props.formValues.province} 
			                    onChange={this.props.onChange} 
			                    type="text" 
			                    className="form-control" 
			                    placeholder="" 
			                    disabled />
			                  </div>
						    </div>
						    <div className="form-group col-md-4 mb-3">
						      <label htmlFor="validationDefault01">Localidad</label>
						      <div className="input-group">
			                    <div className="input-group-prepend">
			                      <span className="input-group-text"><i className="fas fa-map-marker-alt"></i></span>
			                    </div>
			                    <input type="text" 
			                    value={this.props.formValues.city} 
			                    onChange={this.props.onChange} 
			                    className="form-control" 
			                    placeholder="" 
			                    disabled/>
			                  </div>
						    </div>
						  </div>
						  <div className="form-row">
						    <div className="col-md-6 mb-3">
						      <label htmlFor="validationDefault03">Titulo</label>
						      <input type="text" 
						      className="form-control" 
						      id="validationDefault03" 
						      placeholder="Título" 
						      name="title"
						      required
						      value={this.props.formValues.title}
						      onChange={this.props.onChange}/>
						    </div>
						    <div className="col-md-3 mb-3">
							    <label htmlFor="selectCategoria">Categoria Producto</label>
							    <input type="text" 
							      className="form-control" 
							      id="validationDefault04"
							      name="category" 
							      placeholder="Título" 
							      required 
							      value={this.props.formValues.category}
							      onChange={this.props.onChange}/>
							</div>
						  </div>
						  <div className="form-row">
						  	<div className="col-md-12">
						  		<div className="mb-3">
								    <label htmlFor="validationTextarea">Descripción Problema</label>
								    <textarea className="form-control" 
								    id="validationTextarea" 
								    name="detail"
								    value={this.props.formValues.detail}
								    onChange={this.props.onChange} 
								    placeholder="Ingrese Reclamo" 
								    required />
								    <div className="invalid-feedback">
								    </div>
							  	</div>
						  	</div>							  
						 </div>
						 <button className="btn btn-primary" type="submit" href="#">Registrar Reclamo</button>
						</form>
		      		</div>
		    	</div>
			</div>
		);
	}


}