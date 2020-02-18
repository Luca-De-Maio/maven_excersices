import React from 'react';


export default class ListReclamo extends React.Component {


	render(){
		return(
				<div className="content-wrapper">
				<div className="content-header">
			      <div className="container-fluid">
			        <div className="row mb-2">
			          <div className="col-sm-6">
			            <h1 className="m-0 text-dark">Listado de reclamos</h1>
			          </div>

			          {/* /.col */}
			        </div>
			        {/* /.row */}
			      </div>
			      <div className="content">
			      	<div className="container-fluid">
			      		<div className="row">
				      		<div className="col-md-12">
				      			<table id="example2" className="table table-bordered table-hover">
				                	<thead>
						                <tr>
						                  <th>Rendering engine</th>
						                  <th>Browser</th>
						                  <th>Platform(s)</th>
						                  <th>Engine version</th>
						                  <th>CSS grade</th>
						                </tr>
					                </thead>
					             </table>
				            </div>
				         </div>
			      	</div>
			      </div>
				</div>
				</div>

		);
	}
}