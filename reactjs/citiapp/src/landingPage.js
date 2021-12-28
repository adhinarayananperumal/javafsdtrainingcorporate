import React from "react";
import Hookstate from "./hookstate.js";

import {
    BrowserRouter as Router,
    Route,
    Routes,
    Link
} from "react-router-dom";

import LoginPage from './loginPage.js';
import LogOutPage from './logOutPage.js';
import DefaultPage from './defaultPage.js';


function LandingPage() {

    return (
        <Router>
            <div>
                <p><Hookstate></Hookstate></p>
                <ul>
                    <li>
                        <Link to="/">Default</Link>
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
                    <Route exact path="/" element={<DefaultPage />} />
                    <Route path="/login" element={<LoginPage />} />
                    <Route path="/logout" element={<LogOutPage />} />
                </Routes>
            </div>
        </Router>
    );
}

export default LandingPage;