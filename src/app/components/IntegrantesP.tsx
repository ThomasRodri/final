import Image from 'next/image';
import thomas from './../../public/images/thomas.jpg';
import pedro from './../../public/images/pedro.jpg';
import miguel from './../../public/images/miguel.jpg';

export default function IntegrantesP() {
  const backgrounds = [
    {
      id: 1,
      imageUrl: thomas, // Usando a imagem importada diretamente
      texto1: 'Thomas',
      texto2: 'RM558042',
    },
    {
      id: 2,
      imageUrl: pedro, // Usando a imagem de Pedro
      texto1: 'Pedro',
      texto2: 'RM558043',
    },
    {
      id: 3,
      imageUrl: miguel, // Usando a imagem de Miguel
      texto1: 'Miguel',
      texto2: 'RM558044',
    },
  ];

  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-2xl font-bold mb-6">Integrantes</h1>
      <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-4">
        {backgrounds.map((bg) => (
          <div key={bg.id} className="relative h-64 rounded-lg overflow-hidden shadow-md">
            <Image
              src={bg.imageUrl}
              alt={`Background ${bg.id}`}
              layout="fill"
              objectFit="cover"
              className="z-0"
            />
            <div className="absolute inset-0 bg-black bg-opacity-50 flex flex-col justify-end p-4 z-10">
              <p className="text-white text-sm mb-1">{bg.texto1}</p>
              <p className="text-white text-sm">{bg.texto2}</p>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}
