import axios from 'axios';

const USER_API_BASE_URL = "http://localhost:8081/user";

class ApiService {
	
	getAllProducts() {
		return axios.get(USER_API_BASE_URL);
	}

	getProductById(id) {
		return axios.get(USER_API_BASE_URL + '/' + id);
	}

	getUserByName(name) {
		return axios.get(USER_API_BASE_URL + '/' + name);
	}

	//addReclamo(reclamo) {
	//	return axios.post(USER_API_BASE_URL + '/new', {posted_data : reclamo)
	//}

}

export default new ApiService();