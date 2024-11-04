"use client";
import Image from 'next/image';
import Link from 'next/link';
import React from 'react';
import logo from './../../public/images/portobranco.png';

const Rodape: React.FC = () => {
  return (
    <footer className="p-5 bg-black text-white text-center">
      <Image src={logo} alt="Logo Porto" className="w-28 mx-auto mb-4" />
      <Link href="/Integrantes" className="inline-block bg-white text-black py-2 px-4 rounded hover:bg-black hover:text-white transition-colors">
        Ir para a página de Integrantes
      </Link>
    </footer>
  );
};

export default Rodape;
