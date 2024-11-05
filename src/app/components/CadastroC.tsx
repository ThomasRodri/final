"use client";

import React, { useState } from 'react';
import { InputField } from './InputField';
import { ButtonsCadastro } from './ButtonsCadastro';
import Image from 'next/image';
import logo from './../../public/images/porto.png';

const CadastroC: React.FC = () => {
  const [formData, setFormData] = useState({ email: '', senha: '', confirmarSenha: '' });

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleCadastro = async () => {
    if (formData.senha !== formData.confirmarSenha) {
      alert("As senhas não correspondem. Por favor, verifique.");
      return;
    }

    try {
      const response = await fetch("http://localhost:8080/clientes/register", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ email: formData.email, senha: formData.senha }),
      });
      if (response.ok) {
        alert("Cadastro realizado com sucesso!");
      } else {
        alert("Erro ao cadastrar");
      }
    } catch (error) {
      console.error("Erro ao cadastrar:", error);
    }
  };

  return (
    <div className="flex justify-center items-center min-h-screen bg-gray-100">
      <section className="bg-white p-5 rounded-lg shadow-lg text-center w-full max-w-lg m-5 flex flex-col justify-center items-center mx-auto">
        <Image src={logo} alt="Logo" width={150} height={150} />
        
        {/* Input fields */}
        <div className="w-full">
          <InputField 
            placeholder="Email" 
            type="email" 
            name="email"
            className="w-full" 
            onChange={handleInputChange}
          />
          <InputField 
            placeholder="Senha" 
            type="password" 
            name="senha"
            className="w-full" 
            onChange={handleInputChange}
          />
          <InputField 
            placeholder="Confirmar Senha" 
            type="password" 
            name="confirmarSenha"
            className="w-full" 
            onChange={handleInputChange}
          />
        </div>

        {/* Buttons */}
        <div className="w-full mt-4">
          <div onClick={handleCadastro}>
            <ButtonsCadastro />
          </div>
        </div>
      </section>
    </div>
  );
};

export default CadastroC;
