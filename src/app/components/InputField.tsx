"use client"

import React from 'react';

interface InputFieldProps {
  placeholder: string;
  type: string;
  className?: string;
}

export const InputField: React.FC<InputFieldProps> = ({ placeholder, type, className }) => {
  return (
    <div className={className}>
      <input
        type={type}
        placeholder={placeholder}
        className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md placeholder-gray-500 focus:outline-none focus:ring-2 focus:ring-blue-500"
      />
    </div>
  );
};
