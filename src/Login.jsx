import React, { useState } from "react";
import axios from 'axios';

export const Login = (props) =>  {
  
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8085/api/auth/login', { email, password });
      console.log(response.data); // Gérer la réponse de connexion
    } catch (error) {
      setError('Invalid email or password'); // Gérer les erreurs de connexion
    }
  };

  return (
    <div className="auth-form-container">
      <h2>Log in</h2>
      <form className="login-form" onSubmit={handleLogin}>
        <label htmlFor="email">Email</label>
        <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" placeholder='yourmail@gmail.com' id="email" name="email" />
        <label htmlFor="password">Password</label>
        <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" placeholder="***********" id="password" name="password" />
        <button type="submit">Log In</button>
      </form>
      {error && <p>{error}</p>}
      <button className="link-btn" onClick={() => props.onFormSwitch('register')}>Don't have an account? Register here.</button>
    </div>  
  );
};
