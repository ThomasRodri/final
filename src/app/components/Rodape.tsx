"use client"
import Image from 'next/image';
import React from 'react';
import logo from './../../public/images/portobranco.png'

const Rodape: React.FC = () => {
  return (
    <footer className="p-5 bg-black text-white text-center">
      <Image src={logo} alt='Logo Porto' className='w-28 mx-auto' />
    </footer>
  );
};

export default Rodape;
