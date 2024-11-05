"use client";
import React, { useState } from 'react';
import Image from 'next/image';
import logo from './../../public/images/porto.png';

const LoginForm: React.FC = () => {
  const [credentials, setCredentials] = useState({ email: '', senha: '' });

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setCredentials({ ...credentials, [name]: value });
  };

  const handleLogin = async () => {
    try {
      const response = await fetch("http://localhost:8080/clientes/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(credentials),
      });
      if (response.ok) {
        alert("Login bem-sucedido!");
        window.location.href = '/Botpage';
      } else {
        alert("Erro de autenticação");
      }
    } catch (error) {
      console.error("Erro ao logar:", error);
    }
  };

  const handleGoBack = () => {
    window.location.href = '/';
  };

  return (
    <div className="flex justify-center items-center min-h-screen bg-gray-100">
      <div className="bg-gradient-to-b from-[#0082c8] to-[#00578a] p-10 rounded-xl w-[85vw] max-w-[28rem] text-center shadow-lg">
        <Image src={logo} alt="Logo Porto" width={120} height={120} className="mb-6 mx-auto" />
        <h2 className="text-white text-2xl font-semibold mb-6">Iniciar sessão</h2>

        {/* Input Fields */}
        <input
          name="email"
          placeholder="Email ou CPF"
          onChange={handleInputChange}
          className="w-full px-4 py-3 mb-4 text-gray-700 bg-white border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
        />
        <input
          name="senha"
          placeholder="Senha"
          type="password"
          onChange={handleInputChange}
          className="w-full px-4 py-3 mb-4 text-gray-700 bg-white border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500"
        />
        
        {/* Link para cadastro */}
        <p className="text-white text-sm mb-4">
          Não tem cadastro? <a href="/Cadastro" className="font-semibold underline">Crie um!</a>
        </p>

        {/* Buttons */}
        <button
          onClick={handleLogin}
          className="w-full px-5 py-3 mb-3 text-white bg-[#00578a] rounded-md cursor-pointer transition-colors duration-300 hover:bg-blue-800"
        >
          Entrar
        </button>
        <button
          onClick={handleGoBack}
          className="w-full px-5 py-3 text-white bg-[#00578a] rounded-md cursor-pointer transition-colors duration-300 hover:bg-blue-800"
        >
          Voltar à página principal
        </button>
      </div>
    </div>
  );
};

export default LoginForm;
