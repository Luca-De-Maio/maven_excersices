import React from 'react';
import { Link } from 'react-router-dom'

export default class Menu extends React.Component {



	render(){
		return(
			<div>
			  {/* Main Sidebar Container */}
			  <aside className="main-sidebar sidebar-dark-primary elevation-4">
			    {/*Brand Logo */}
			    <a href="index3.html" className="brand-link">
			      <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" className="brand-image img-circle elevation-3"
			           style={{opacity: "0.8"}} />
			      <span className="brand-text font-weight-light">AdminLTE 3</span>
			    </a>

			    {/* Sidebar */}
			    <div className="sidebar">
			      {/* Sidebar user panel (optional) */}
			      <div className="user-panel mt-3 pb-3 mb-3 d-flex">
			        <div className="image">
			          <img src="dist/img/user2-160x160.jpg" className="img-circle elevation-2" alt="User Image" />
			        </div>
			        <div className="info">
			          <a href="#" className="d-block">Alexander Pierce</a>
			        </div>
			      </div>

			      {/* Sidebar Menu */}
			      <nav className="mt-2">
			        <ul className="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
			         
			          <li className="nav-header">GESTIONAR RECLAMOS</li>
				          <li className="nav-item">
				            <Link to="/registrar-reclamo" className="nav-link">
				              <i className="nav-icon far fa-envelope"></i>
				              <p>Registrar Reclamo</p>
				            </Link>
				          </li>
				          <li className="nav-item">
				            <a href="#" className="nav-link">
				              <i className="nav-icon fas fa-book"></i>
				              <p>Listar Reclamos</p>
				            </a>
				          </li>
			          
			          
			        </ul>
			      </nav>
			      {/* /.sidebar-menu */}
			    </div>
			    {/* /.sidebar */}
			  </aside>
			</div>
		);
	}

}