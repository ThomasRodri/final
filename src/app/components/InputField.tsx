"use client"

import React from 'react';

interface InputFieldProps {
  placeholder: string;
  type: string;
  className?: string;
  name?: string;
  onChange?: (e: React.ChangeEvent<HTMLInputElement>) => void;
}

export const InputField: React.FC<InputFieldProps> = ({ placeholder, type, className, name, onChange }) => {
  return (
    <div className={className}>
      <input
        type={type}
        placeholder={placeholder}
        name={name}
        onChange={onChange}
        className="w-full px-4 py-2 mb-4 border border-gray-300 rounded-md placeholder-gray-500 focus:outline-none focus:ring-2 focus:ring-blue-500"
      />
    </div>
  );
};
