
import { useState } from "react";
import ReactDOM from 'react-dom';

import axios from 'axios';
import { useNavigate } from 'react-router-dom';



export default function RegNewCustomer() {
    let navigate = useNavigate();
    const [name, setName] = useState("Incedo");
    const [age, setAge] = useState("0");

    const saveCustomer = () => {
        /*  axios.put(`https://60fbca4591156a0017b4c8a7.mockapi.io/fakeData`, {
             name,
             age,
         }).then(() => {
             useNavigate.push('/login');
         }); */
        alert("form submitted successfully.....");

        navigate('/login');
    }


    return (
        <div>
            <h3> Customer Registration Form </h3>
            Name: {name}
<br></br>
            Age: {age}

            <form>
                <label>Enter your Customer Name:
                    <input
                        type="text"
                        value={name}
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
                <input type='button' onClick={saveCustomer} value="Register Customer" />

            </form>

            <p> ...</p>
        </div>

    )
}