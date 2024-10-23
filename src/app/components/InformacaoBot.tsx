"use client"

import React from 'react';
import Image from 'next/image';
import mulher from './../../public/images/mulher.png';
import carro from './../../public/images/branco-summit-novo-onix.png';
import gosma from './../../public/images/vector.png';
import robo from './../../public/images/robo.png';

const InformacaoBot: React.FC = () => {
  return (
    <div className="font-sans">
      <div className="bg-white p-6 rounded-lg shadow-lg text-center w-full max-w-5xl mx-auto"> {/* Reduzi o tamanho da largura máxima para max-w-5xl e o padding para p-6 */}
        
        {/* Texto superior */}
        <div className="mb-6"> {/* Diminuí o espaçamento inferior */}
          <span className="text-xl text-white bg-blue-600 px-4 py-2 rounded-md">BRASIL</span> {/* Reduzi o tamanho do texto */}
          <h2 className="text-4xl text-blue-700 mb-3">Conserto automobilístico</h2> {/* Reduzi o tamanho do texto */}
          <p className="text-3xl text-gray-800">+100 OFICINAS</p> {/* Reduzi o tamanho do texto */}
        </div>
    
        {/* Linha de imagens */}
        <div className="flex justify-around items-center mb-6 relative"> {/* Reduzi o espaçamento entre as imagens */}
          <div className="w-1/4"> 
            <Image src={mulher} alt="Mulher" width={150} height={150} /> {/* Diminuí o tamanho da imagem */}
          </div>
          <div className="w-1/4">
            <Image src={robo} alt="Robozinho" width={150} height={150} /> {/* Diminuí o tamanho da imagem */}
          </div>
          <div className="relative w-1/2">
            {/* Posiciona a gosma atrás do carro */}
            <div className="absolute inset-0 z-0"> {/* A gosma ficará no fundo */}
              <Image src={gosma} alt="Gosma" layout="fill" className="w-full" />
            </div>
            <div className="relative z-10"> {/* O carro ficará na frente */}
              <Image src={carro} alt="Carro" width={500} height={250} />
            </div>
          </div>
        </div>
    
        {/* Texto inferior */}
        <h2 className="text-4xl text-blue-700 mb-4">Atendimento via IA</h2> {/* Reduzi o tamanho do texto */}
        <p className="text-2xl text-gray-800"> {/* Reduzi o tamanho do texto */}
          Não deixe passar a oportunidade de ser atendido pelo <strong>Visinho!</strong> Nossa IA focada em lhe guiar
          durante todo o processo.
        </p>
        
        {/* Botão */}
        <a
          href="/Login"
          className="inline-block px-6 py-3 bg-blue-500 text-white rounded-md mt-6 text-xl hover:bg-blue-700 transition-colors"
        >
          COMECE JÁ!
        </a>
      </div>
    </div>
  );
};

export default InformacaoBot;
