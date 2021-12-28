import React from "react";
import './citystyle.css';


import {
    BrowserRouter as Router,
    Route,
    Routes,
    Link
} from "react-router-dom";

import Login from './login.js';
import LogOut from './logout.js';
import RegNewCustomer from './regNewCustomer.js';
import Product from './propswelcome.js';
import Clock from "./clock";





export default function FirstPage() {

    return (


        <Router>
            <div>
                <h1 className="companyname"> ICICI Bank </h1>
                <p> <Clock> </Clock></p>
                <hr></hr>
                <ul>
                    <li>
                        <Link to="/customerreg">New Customer Registration</Link>
                    </li>
                    <li>
                        <Link to="/login">Login</Link>
                    </li>
                    <li>
                        <Link to="/logout">Logout</Link>
                    </li>
                </ul>

                <hr />


                <Routes>
                    <Route exact path="/customerreg" element={<RegNewCustomer />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/logout" element={<LogOut />} />
                </Routes>
            </div>
        </Router>

    )
}