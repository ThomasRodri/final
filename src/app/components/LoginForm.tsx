"use client"
import React from 'react';
import Image from 'next/image';
import logo from './../../public/images/porto.png'

const LoginForm: React.FC = () => {

  const handleLogin = () => {
    window.location.href = '/Botpage';
  };

  const handleGoBack = () => {
    window.location.href = '/';
  };

  return (
    <div className="flex justify-center items-center min-h-screen">
      <div className="bg-gradient-to-b from-[#0082c8] to-[#00578a] p-8 rounded-xl w-[80vw] max-w-[30rem] text-center shadow-lg">
        <Image src={logo} alt='Logo Porto' className='w-3/5 mx-auto' />

        <h2 className="text-white text-2xl mb-6 font-bold">Iniciar sessão</h2>

        <div className="mb-4 w-[90%] mx-auto">
          <input
            type="text"
            placeholder="Email ou CPF"
            className="w-full p-3 mt-2 rounded-lg border-none font-bold"
          />
        </div>

        <div className="mb-4 w-[90%] mx-auto">
          <input
            type="password"
            placeholder="Senha"
            className="w-full p-3 mt-2 rounded-lg border-none font-bold"
          />
        </div>
        
        <a href="/Cadastro" className="text-white block mt-4 font-bold hover:underline">
          Não tem cadastro? Crie um!
        </a>

        <button
          type="button"
          onClick={handleLogin}
          className="inline-block p-3 mt-4 text-white bg-[#00578a] rounded-lg w-[90%] text-lg font-bold hover:bg-[#004a70]"
        >
          Entrar
        </button>

        <button
          onClick={handleGoBack}
          className="inline-block p-3 mt-4 text-white bg-[#00578a] rounded-lg w-[90%] text-lg font-bold hover:bg-[#004a70]"
        >
          Voltar à página principal
        </button>
      </div>
    </div>
  );
};

export default LoginForm;
