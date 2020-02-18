import React from 'react';
import Footer from '../components/Footer';
import Header from '../components/Header';
import Menu from '../components/Menu';
import RegistrarReclamoForm from '../components/RegistrarReclamoForm';
import SearchBar from '../components/SearchBar';
import ApiService from '../ApiService';
import axios from 'axios'

export default class RegistrarReclamo extends React.Component {

	state = {
		form: {
			name: '',
			lastName: '',
			dni: '',
			tel: '',
			province: '',
			city: '',
			title: '',
			category: '',
			model: '',
			detail: '',
		},
	};

	handleChange = e => {
        this.setState({
            form: {
                ...this.state.form,
                [e.target.name]: e.target.value,
            }
        });
    };

    handleChange2 = e => {
    	ApiService.getUserByName(e.target.value)
    		.then(res => {this.setState({form: res.data})});
    };

	handleSubmit = async e => {
		e.preventDefault();

		var reclamo = {
			titulo: this.state.form.title,
			detalle: this.state.form.detail,
			estado: true,
			user: {
				name: this.state.form.name,
				lastName: this.state.form.lastName,
				telefono: this.state.form.tel,
				dni: this.state.form.dni,
				province: this.state.form.province,
				city: this.state.form.city
			},
			product: {
				nombre: this.state.form.category
			}
		}

		axios.post('http://localhost:8081/reclamo/new', reclamo)
			.then(res => console.log(res.data))
		console.log(reclamo);
	}

	render(){
		return(
			<div>
				<Header />
				<Menu />
				<div className="content-wrapper">
				    <div className="content-header">
				      <div className="container-fluid">
				        <div className="row mb-2">
				          <div className="col-sm-6">
				            <h1 className="m-0 text-dark">Registrar Reclamo</h1>
				          </div>
				        </div>
				      </div>
				    </div>
				    <SearchBar 
				    	onChange = {this.handleChange2}
				    />
				    <RegistrarReclamoForm 
				    	onChange = {this.handleChange}
				    	onSubmit = {this.handleSubmit}
				    	formValues = {this.state.form}
				    />
				</div>
				<Footer />
			</div>
		);
	}

}
