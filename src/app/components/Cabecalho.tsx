"use client"

import Link from 'next/link';



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
        <img src="/porto.png" alt="logo da porto"/>
      </a>

      {/* Navigation */}
      <nav>
        <Link href="/login">
          {/* Remova o elemento <a> */}
          <span className="px-4 py-2 bg-blue-500 text-white rounded-md transition-colors duration-300 hover:bg-blue-700">
            Login
          </span>
        </Link>
      </nav>
    </header>
  );
};

export default Cabecalho;
