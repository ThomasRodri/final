"use client"

import React from 'react';
import { InputField } from './InputField';
import { ButtonsCadastro } from './ButtonsCadastro';
import Image from 'next/image';

const CadastroC: React.FC = () => {
  return (
    <section className="bg-white p-5 rounded-lg shadow-lg text-center w-full max-w-lg m-5 flex flex-col justify-center items-center">
      {/* Logo */}
      <div className="w-2/3 mb-5">
        <Image src="/porto.png" alt="Logo" width={200} height={80} className="rounded-t-lg" />
      </div>

      {/* Heading */}
      <h2 className="mb-5 text-2xl font-semibold text-gray-800">Inicie seu Cadastro!</h2>

      {/* Input fields */}
      <div className="w-full">
        <InputField placeholder="Nome completo" type="text" className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md" />
        <InputField placeholder="Email ou CPF" type="text" className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md" />
        <InputField placeholder="Crie sua senha" type="password" className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md" />
        <InputField placeholder="Confirme sua senha" type="password" className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md" />
      </div>

      {/* Buttons */}
      <ButtonsCadastro />
    </section>
  );
};

export default CadastroC;
