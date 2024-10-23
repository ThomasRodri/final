"use client"
import React from 'react';


export const ButtonsCadastro: React.FC = () => {
  return (
    <>
      {/* Submit Button */}
      <button
        type="submit"
        className="w-full px-5 py-2 bg-blue-500 text-white rounded-md mt-4 cursor-pointer transition-colors duration-300 hover:bg-blue-700"
      >
        Enviar as Informações
      </button>

      {/* Back Button */}
      <button
        type="button"
        className="w-full px-5 py-2 bg-gray-600 text-white rounded-md mt-3 cursor-pointer transition-colors duration-300 hover:bg-gray-700"
        onClick={() => window.location.href = '/Login'}
      >
        Voltar
      </button>
    </>
  );
};
