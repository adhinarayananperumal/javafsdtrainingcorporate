import { useState } from "react";
import ReactDOM from 'react-dom';


import SimpleCusForm from "./simplecusform.js";
import StateExample from "./stateExample.js";
import CustomerService from "./customerService.js";
import { useNavigate } from 'react-router-dom';


function DefaultPage() {
    let navigate = useNavigate();
    const [customerName, setName] = useState("Incedo");
    const [age, setAge] = useState("0");


    function registerNewCustomer() {
        alert("Form Submission successfull....."+ customerName + "-----" + age);
        let status = CustomerService.saveCustomer({customerName,age});
        alert(status);
        navigate('/login');
    }


    return (
        <div>
      
      <p> Customer Name: {customerName}  </p>
      <p> Age: {age}  </p>



            <h1> Welcome to Citi i banking portal </h1>

            <h3> Customer registration Form</h3>

            <form>
                <label>Enter your Customer Name:
                    <input
                        type="text"
                        value={customerName}
                        onChange={(e) => setName(e.target.value)}
                    />
                </label>

                <br></br>
                <label>Enter your age:
                    <input
                        type="text"
                        value={age}
                        onChange={(e) => setAge(e.target.value)}
                    />
                </label>
                <br></br>
                <input type='button' onClick={registerNewCustomer} value="Register Customer" />

            </form>


        </div>
    );
}

export default DefaultPage;