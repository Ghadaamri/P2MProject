import React, { useState } from "react";
import axios from 'axios';

export const Register = (props) =>  {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8085/api/auth/signup', { name, email, password });
      console.log(response.data); // Gérer la réponse d'inscription
    } catch (error) {
      setError('User already exists'); // Gérer les erreurs d'inscription
    }
  };

  return (
    <div className="auth-form-container">
      <h2>Register</h2>
      <form className="register-form" onSubmit={handleSubmit}>
        <label htmlFor="name">Full name</label>
        <input value={name} onChange={(e) => setName(e.target.value)} type="text" placeholder='Full name' id="name" name="name" />
        <label htmlFor="email">Email</label>
        <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" placeholder='yourmail@gmail.com' id="email" name="email" />
        <label htmlFor="password">Password</label>
        <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" placeholder="***********" id="password" name="password" />
        <button type="submit">Register</button>
      </form>
      <button className="link-btn" onClick={() => props.onFormSwitch('login')}>Already have an account? Login here.</button>
      {error && <p>{error}</p>}
    </div>
  );
}
