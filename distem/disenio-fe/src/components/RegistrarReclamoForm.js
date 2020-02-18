import React from 'react';
import Modal from '../components/Modal';
import ApiService from '../ApiService';

export default class RegistrarReclamoForm extends React.Component {

	constructor(props) {
		super(props);
		this.state = {
			busquedaUsuario : '',
			usuarioSeleccionado: null,
			reclamo: {
				name: '',
				lastName: '',
				dni: '',
				province: '',
				city: '',
			},
			usuariosList: {
					"Gustavo Hoof": { nombre: 'Gustavo', apellido: 'Hoof', dni: '38547255', tel: '3624569874', provincia: 'Catamarca', localidad: 'Andalgalá'}, 
					"Sabrina Delamea": { nombre:'Sabrina', apellido: 'Delamea', dni: '37458244', tel: '3624518763', provincia: 'Catamarca', localidad: 'Andalgalá'},
					"Eduardo Monzón": { nombre: 'Eduardo',apellido: 'Monzón', dni: '31256322', tel: '3658745896', provincia: 'Chaco', localidad: 'Resistencia' },
					"Bromtlik Jugoslik": { nombre: 'Bromtlik', apellido: 'Jugoslik', dni: '31452366', tel: '3258987458', provincia: 'Tierra del Fuego', localidad: 'Tierra del Fuego' }, 
					"Fremur Hijzils": { nombre: 'Fremur', apellido: 'Hijzils', dni: '35896877', tel: '3256985698', provincia: 'Buenos Aires', localidad: 'La Plata' }
				},
			productosList: {
				"Anafes Electricos" : {categoria: 'Anafes Electricos', modelo: {}, peso: '143', detalle: 'Anafe electrico especializado para cocinas chicas'},
				"Anafes a Gas": {categoria: 'Anafes a Gas', modelo: {}, peso: '98', detalle: 'Anafe a gas especializado para cocinas medianas y pequeñas'},
				"Heladeras electricas" : {categoria: 'Heladeras electricas', modelo: {}, peso: '290', detalle: 'Heladera eléctrica de tamaño mediano'}
			},
			categoriaList: [
				{nombre: "Anafes Electricos"},
				{nombre: "Anafes a Gas"},
				{nombre: "Heladeras electricas"},
				{nombre: "Heladeras a Gas"},
			],
			 isOpen: false,
			 reclamoList: {}
		};
		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
		this.handleModal = this.handleModal.bind(this);
		//this.handleSelectChange = this.handleSelectChange.bind(this);
	};

		handleModal(){
    		this.setState({isOpen: !this.state.isOpen});
	    }

		handleSubmit(e) {
			this.setState({reclamo: e.target.value});
		}

		handleChange(e){
			ApiService.getUserByName(0)
				.then((res) => {this.setState({reclamo: res.data})});
		}

		cargarDatos(nombreUsuario){
			ApiService.getUserByName(nombreUsuario)
				.then(res => {
						this.setState({reclamo: res.data.result})
				});
		}

	render(){
		return(
			<div className="content-wrapper">
			<Modal show={this.state.isOpen}
	          onClose={this.toggleModal}>
	          Here's some content for the modal
	        </Modal>
			    <div className="content-header">
			      <div className="container-fluid">
			        <div className="row mb-2">
			          <div className="col-sm-6">
			            <h1 className="m-0 text-dark">Registrar Reclamo</h1>
			          </div>
			        </div>
			      </div>
			    </div>
			    <div className="content">
			      	<div className="container-fluid">
			      		<div className="row pt-4 pl-3 pr-4 pb-2">
			      			<div className="col-md-6">
			      			<label htmlFor="searchInput">Usuario registrado</label>
			      				<div id="searchInput" className="input-group">
			      					<div className="input-group-prepend">
			      						<span className="input-group-text"><i className="fas fa-search"></i></span>
			      					</div>
			      					<input id="buscarUsuario" value={this.state.buscarUsuario} onChange={(e) => {this.handleChange(e)}} ref="buscarUsuario" type="text" className="form-control" list="usuarios" placeholder="search" />
			      					<datalist id="usuarios">
			      						<option>Eduardo Monzón</option>
			      						<option>Sabrina Delamea</option>
			      						<option>Gustavo Hoof</option>
			      						<option>Bromtlik Jugoslik</option>
			      						<option>Fremur Hijzils</option>
			      					</datalist>
			      				</div>
			      			</div>
			      		</div>
			      		<div className=" pl-3 pr-5">
			      			<hr width="1000px"/>
			      		</div>
			      		<div className="row pt-4 pl-4 pr-4">
					      	<form onSubmit={this.handleSubmit}>
							  <div className="form-row">
							    <div className="form-group col-md-4 mb-3">
							      <label htmlFor="validationDefault01">Nombre</label>
							      <div className="input-group">
				                    <div className="input-group-prepend">
				                      <span className="input-group-text"><i className="fas fa-user"></i></span>
				                    </div>
				                    <input type="text" value={this.state.reclamo.name} className="form-control" placeholder="" disabled/>
				                  </div>
							    </div>
							    <div className="form-group col-md-4 mb-3">
							      <label htmlFor="validationDefault01">Apellido</label>
							      <div className="input-group">
				                    <div className="input-group-prepend">
				                      <span className="input-group-text"><i className="fas fa-user"></i></span>
				                    </div>
				                    <input type="text" className="form-control" value={this.state.reclamo.lastName} placeholder="" disabled/>
				                  </div>
							    </div>
				    			<div className="form-group col-md-4 mb-3">
							      <label htmlFor="validationDefault01">Dni</label>
							      <div className="input-group">
				                    <div className="input-group-prepend">
				                      <span className="input-group-text"><i className="fas fa-id-card"></i></span>
				                    </div>
				                    <input type="text" className="form-control" value={this.state.reclamo.dni} placeholder="" disabled />
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
				                    <input type="text" className="form-control" value={this.state.reclamo.tel} disabled/>
				                  </div>
				                </div>
				    			<div className="form-group col-md-4 mb-3">
							      <label htmlFor="validationDefault01">Provincia</label>
							      <div className="input-group">
				                    <div className="input-group-prepend">
				                      <span className="input-group-text"><i className="fas fa-map-marker-alt"></i></span>
				                    </div>
				                    <input id="inputProvincias" value={this.state.reclamo.province} type="text" className="form-control" placeholder="" disabled />
				                  </div>
							    </div>
							    <div className="form-group col-md-4 mb-3">
							      <label htmlFor="validationDefault01">Localidad</label>
							      <div className="input-group">
				                    <div className="input-group-prepend">
				                      <span className="input-group-text"><i className="fas fa-map-marker-alt"></i></span>
				                    </div>
				                    <input type="text" value={this.state.reclamo.city} className="form-control" placeholder="" disabled/>
				                  </div>
							    </div>
							  </div>
							  <div className="form-row">
							    <div className="col-md-6 mb-3">
							      <label htmlFor="validationDefault03">Titulo</label>
							      <input type="text" className="form-control" id="validationDefault03" placeholder="Título" required onChange={this.handleChange}/>
							    </div>
							    <div className="col-md-3 mb-3">
							    <label htmlFor="selectCategoria">Categoria Producto</label>
							    <select id="selectCategoria" className="form-control" onChange={this.handleSelectChange}>{this.state.categoriaList.map((cat, index) => <option key={index} value={cat.nombre}>{cat.nombre}</option>)}
								</select>  
							    </div>
							    <div className="col-md-3 mb-3">
								    <label htmlFor="selectModelo">Modelo</label>
								    <select id="selectModelo" className="form-control" onChange={this.handleChange}>}
										<option>F50-A</option>
										<option>F50-B</option> 
										<option>C25-A</option> 
										<option>C90-B</option> 
										<option>A3-19</option> 
									</select>  
							    </div>
							  </div>
							  <div className="form-row">
							  	<div className="col-md-12">
							  		<div className="mb-3">
									    <label htmlFor="validationTextarea">Descripción Problema</label>
									    <textarea className="form-control" id="validationTextarea" placeholder="Ingrese Reclamo" onChange={this.handleChange} required></textarea>
									    <div className="invalid-feedback">
									  
									    </div>
								  	</div>
							  	</div>							  
							 </div>
							 <button className="btn btn-primary" type="submit" href="#">Registrar Reclamo</button>
							</form>
			      	</div>
				</div>
			      {/* /.container-fluid */}
			    </div>
			</div>
		);
	}


}