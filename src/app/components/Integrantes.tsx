import React from 'react';

const Integrantes: React.FC = () => {
  return (
    <div className="flex justify-center gap-5 p-5">
      <div className="text-center">
        <img
          src="thomas.jpg"
          alt="Foto do Thomas "
          className="w-36 h-36 object-cover rounded-full"
        />
        <p className="mt-2">Nome: Thomas Rodrigues Ribeiro Silva</p>
        <p>RM: 558042</p>
      </div>

      <div className="text-center">
        <img
          src="miguel.jpg"
          alt="Foto do Miguel"
          className="w-36 h-36 object-cover rounded-full"
        />
        <p className="mt-2">Nome: Miguel Barros Ramos</p>
        <p>RM: 556652</p>
      </div>

      <div className="text-center">
        <img
          src="pedro.jpg"
          alt="Foto do Pedro"
          className="w-36 h-36 object-cover rounded-full"
        />
        <p className="mt-2">Nome: Pedro Valentim Merise</p>
        <p>RM: 556826</p>
      </div>
    </div>
  );
};

export default Integrantes;
