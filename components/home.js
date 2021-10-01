import React from "react";
import { Link } from "react-router-dom";
import "../styles/home.css"


const home = () => {
  return (
    <div class="background">
      <p className="topleft">One Shop Store</p>
      <div class="container">
        <h1>
          <span></span>
        </h1>
        <div class="load"></div>
      </div>
      <li >
        <Link className="topright" to="/privacy">Privacy</Link>
      </li>
      <li >
        <Link className="topright_2" to="/terms">Terms and Conditions</Link></li>
      <div className="app"></div>
    </div>
  );
};

export default home;
