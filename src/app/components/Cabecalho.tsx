"use client"

import Link from 'next/link';
import Image from 'next/image';
import logo from './../../public/images/porto.png'



const Cabecalho: React.FC = () => {
  return (
    <header className="flex justify-between items-center p-5 bg-gray-200">
      {/* Logo */}
      <a
        href="https://www.portoseguro.com.br"
        target="_blank"
        rel="noopener noreferrer"
        className="flex-shrink-0"
      >
        <Image src={logo} alt='Logo Porto' className='w-72' />
      </a>

      {/* Navigation */}
      <nav>
        <Link href="/Login">
          {/* Remova o elemento <a> */}
          <span className="px-4 py-2 bg-blue-500 text-white rounded-md transition-colors duration-300 hover:bg-blue-700 w-80">
            Login
          </span>
        </Link>
      </nav>
    </header>
  );
};

export default Cabecalho;
