
"use client"
import React from 'react';


const LoginForm: React.FC = () => {

  const handleLogin = () => {
    // Redireciona para a página do bot
    window.location.href = '/botpage';
  };

  const handleGoBack = () => {
    // Redireciona para a página principal
    window.location.href = '/';
  };

  return (
    <div className="bg-gradient-to-b from-[#0082c8] to-[#00578a] p-8 rounded-xl w-[80vw] max-w-[30rem] text-center shadow-lg">
   

      <h2 className="text-white text-2xl mb-6 font-sans">Iniciar sessão</h2>

      <div className="mb-4 w-[90%] mx-auto">
        <input
          type="text"
          placeholder="Email ou CPF"
          className="w-full p-3 mt-2 rounded-lg border-none font-sans"
        />
      </div>

      <div className="mb-4 w-[90%] mx-auto">
        <input
          type="password"
          placeholder="Senha"
          className="w-full p-3 mt-2 rounded-lg border-none font-sans"
        />
      </div>

      <a href="/cadastro" className="text-white block mt-4 font-sans hover:underline">
        Não tem cadastro? Crie um!
      </a>

      <button
        type="button"
        onClick={handleLogin}
        className="inline-block p-3 mt-4 text-white bg-[#00578a] rounded-lg w-[90%] text-lg font-sans hover:bg-[#004a70]"
      >
        Entrar
      </button>

      <button
        onClick={handleGoBack}
        className="inline-block p-3 mt-4 text-white bg-[#00578a] rounded-lg w-[90%] text-lg font-sans hover:bg-[#004a70]"
      >
        Voltar à página principal
      </button>
    </div>
  );
};

export default LoginForm;