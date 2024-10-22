"use client"

import React from 'react';
import { InputField } from './InputField';
import { ButtonsCadastro } from './ButtonsCadastro';
import Image from 'next/image';
import logo from './../../public/images/porto.png'

const CadastroC: React.FC = () => {
  return (
    <div className="flex justify-center items-center min-h-screen bg-gray-100">
      <section className="bg-white p-5 rounded-lg shadow-lg text-center w-full max-w-lg m-5 flex flex-col justify-center items-center mx-auto">
        {/* Logo */}
        <div className="w-2/3 mb-5">
          <Image src={logo} alt='Logo Porto' className='w-72' />
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
    </div>
  );
};

export default CadastroC;
