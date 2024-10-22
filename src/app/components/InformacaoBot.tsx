"use client"

import React from 'react';
import Image from 'next/image';

const InformacaoBot: React.FC = () => {
  return (
    <div className="font-sans">
      <div className="bg-white p-5 rounded-lg shadow-lg text-center w-11/12 max-w-5xl mx-auto">
        {/* Texto superior */}
        <div className="mb-5">
          <span className="text-xl text-white bg-blue-600 px-3 py-1 rounded-md">BRASIL</span>
          <h2 className="text-3xl text-blue-700 mb-3">Conserto automobilístico</h2>
          <p className="text-2xl text-gray-800">+100 OFICINAS</p>
        </div>

        {/* Linha de imagens */}
        <div className="flex justify-around items-center mb-5">
          <div className="w-1/6">
            <Image src="/mulher.png" alt="Mulher" width={100} height={100} />
          </div>
          <div className="w-1/6">
            <Image src="/robo.png" alt="Robozinho" width={100} height={100} />
          </div>
          <div className="relative w-1/3">
            <Image src="/vector.png" alt="Gosma" layout="fill" className="absolute top-0 left-0 w-full" />
            <Image src="/branco-summit-novo-onix.png" alt="Carro" width={400} height={200} />
          </div>
        </div>

        {/* Texto inferior */}
        <h2 className="text-3xl text-blue-700 mb-3">Atendimento via IA</h2>
        <p className="text-2xl text-gray-800">
          Não deixe passar a oportunidade de ser atendido pelo <strong>Visinho!</strong> Nossa IA focada em lhe guiar
          durante todo o processo.
        </p>
        
        {/* Botão */}
        <a
          href="/Login"
          className="inline-block px-6 py-3 bg-blue-500 text-white rounded-md mt-5 text-xl hover:bg-blue-700 transition-colors"
        >
          COMECE JÁ!
        </a>
      </div>
    </div>
  );
};

export default InformacaoBot;
