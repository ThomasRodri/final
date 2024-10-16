"use client"

import React from 'react';

const Rodape: React.FC = () => {
  return (
    <footer className="p-5 bg-black text-white text-center">
      <img
        src="/imagem.white porto.png" // Certifique-se de que o caminho da imagem esteja correto
        alt="Logo"
        className="w-[150px]"
      />
    </footer>
  );
};

export default Rodape;
