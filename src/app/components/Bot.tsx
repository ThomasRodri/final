"use client"
import { useState } from 'react';

const Bot = () => {
  const initialMessages = [
    { sender: 'bot', text: "Qual é o problema com o carro?" }
  ];

  const [messages, setMessages] = useState(initialMessages);
  const [userInput, setUserInput] = useState('');
  const [step, setStep] = useState(1); // Inicia em 1, pois já fizemos a primeira pergunta 


  // Fluxo de perguntas do bot para o diagnóstico
  const botQuestions = [
    "Qual é o problema com o carro?",
    "O carro faz algum barulho estranho?",
    "Há alguma luz de aviso acesa no painel?",
    "Quando o problema começou?",
    "Já levou o carro ao mecânico antes?"
  ];

  // As respostar criadas para cada pergunta do bot
  const suggestedAnswers = [
    [
      
      
      "Ele está demorando para ligar, especialmente nas manhãs frias.",
      "O freio está parecendo mais rígido e demora para responder.",
      "Estou sentindo um cheiro estranho de queimado quando o motor esquenta.",
     
      "Sinto que o carro está sem força quando subo uma ladeira.",
      "Está saindo fumaça branca do escapamento quando eu acelero."
    ],
    [
      "Sim, ele faz um barulho metálico toda vez que eu acelero.",
      "Não, ele está silencioso, só aquela luz no painel acendeu.",
      "Não faz barulho, só está demorando para ligar.",
      "Sim, parece um rangido vindo dos freios.",
      "Sim, faz um barulho de assobio quando o motor esquenta.",
      "Não, ele só está sem ar-condicionado mesmo.",
      "Não percebi nenhum barulho, mas ele está sem força nas subidas.",
      "Sim, faz um som de estouro quando a fumaça branca sai."
    ],
    [
      "Sim, a luz do motor acendeu quando o carro começou a fazer o barulho estranho.",
      "Sim, é justamente a luz de alerta que me preocupou ontem.",
      "Não, não há luz acesa, só está demorando para ligar mesmo.",
      "Sim, a luz de freio está acesa, provavelmente por causa da rigidez.",
      "Sim, a luz de temperatura do motor acendeu quando senti o cheiro estranho.",
      "Não, não há luz acesa, só o ar-condicionado que parou de funcionar.",
      "Não, nenhuma luz, mas ele está realmente sem força nas subidas.",
      "Sim, a luz da emissão acendeu quando começou a sair fumaça branca."
    ],
    [
      "Começou ontem à noite, quando ouvi aquele barulho metálico pela primeira vez.",
      "Começou hoje pela manhã, logo depois que a luz de alerta acendeu.",
      "Faz alguns dias, quando percebi que ele começou a demorar para ligar.",
      "O problema começou há umas duas semanas, quando ouvi aquele rangido nos freios.",
      "Começou quando notei que o motor esquentava mais do que o normal.",
      "Na semana passada, quando o ar-condicionado parou de funcionar.",
      "Começou há alguns dias, quando o carro começou a perder potência nas subidas.",
      "Quando a fumaça branca começou a sair do escapamento, há cerca de três dias."
    ],
    [
      "Sim, levei ontem assim que ouvi o barulho metálico, mas ele ainda não conseguiu encontrar o problema.",
      "Não, ainda não tive tempo de levar desde que a luz de alerta acendeu.",
      "Sim, levei faz alguns dias quando ele começou a demorar para ligar, mas não resolveram.",
      "Sim, levei há duas semanas quando o freio começou a ranger, mas o problema voltou.",
      "Sim, já levei quando percebi o superaquecimento do motor, mas parece que não resolveu.",
      "Ainda não, como foi ontem que o ar-condicionado parou de funcionar, não tive como levar.",
      "Sim, levei há alguns dias quando ele começou a perder potência nas subidas, mas não ficou 100%.",
      "Não, ainda não levei, estou tentando entender o motivo da fumaça branca antes."
    ],
  ];

  const handleSend = (input: string) => {
    if (!input) return;

    // Adiciona a mensagem do usuário e a resposta do bot
    setMessages((prev) => [...prev, { sender: 'user', text: input }]);
    setUserInput('');

    // Verifica se ainda há perguntas do bot para fazer
    if (step < botQuestions.length) {
      const nextQuestion = botQuestions[step];
      setTimeout(() => {
        setMessages((prev) => [...prev, { sender: 'bot', text: nextQuestion }]);
        setStep((prevStep) => prevStep + 1);
      }, 1000);
    } else {
      // Mensagem final sugerindo a visita ao mecânico
      setTimeout(() => {
        setMessages((prev) => [
          ...prev,
          { sender: 'bot', text: "Com base nas informações fornecidas, recomendamos levar seu carro a um mecânico para uma vistoria completa." }
        ]);
        
        // Recomeça a conversa
        setTimeout(() => {
          setMessages((prev) => [
            ...prev,
            { sender: 'bot', text: "Qual é o problema com o carro?" }
          ]);
          setStep(1); // Reinicia o passo
        }, 3000); // Tempo para exibir a mensagem final antes de reiniciar
      }, 1000);
    }
  };

  return (
    <div style={{ display: 'flex', flexDirection: 'column', height: '100vh' }}>
      <h1 style={{ textAlign: 'center', padding: '10px', margin: 0, backgroundColor: '#3B82F6', color: '#fff' }}>
      Visinho Assistant
      </h1>

      <div style={{ flex: 1, overflowY: 'auto', padding: '20px', backgroundColor: '#f9f9f9' }}>
        {messages.map((msg, index) => (
          <div
            key={index}
            style={{
              display: 'flex',
              justifyContent: msg.sender === 'bot' ? 'flex-start' : 'flex-end',
              marginBottom: '10px'
            }}
          >
            <div
              style={{
                maxWidth: '60%',
                padding: '10px',
                borderRadius: '10px',
                backgroundColor: msg.sender === 'bot' ? '#e0e0e0' : '#3B82F6',
                color: msg.sender === 'bot' ? '#000' : '#fff',
                textAlign: msg.sender === 'bot' ? 'left' : 'right'
              }}
            >
              {msg.text}
            </div>
          </div>
        ))}
      </div>

      <div style={{ borderTop: '1px solid #ddd', padding: '10px', backgroundColor: '#fff' }}>
        <input
          type="text"
          value={userInput}
          onChange={(e) => setUserInput(e.target.value)}
          placeholder="Digite sua mensagem..."
          style={{ width: 'calc(100% - 100px)', padding: '10px', marginRight: '10px' }}
        />
        <button onClick={() => handleSend(userInput)} style={{ padding: '10px', width: '80px' }}>
          Enviar
        </button>
      </div>

      {/* Sugestões de respostas para a pergunta atual */}
      <div style={{ padding: '10px', backgroundColor: '#f0f0f0', borderTop: '1px solid #ddd' }}>
        <h3>Sugestões de Respostas:</h3>
        <ul>
          {suggestedAnswers[step - 1]?.map((answer, index) => (
            <li key={index} onClick={() => handleSend(answer)} style={{ cursor: 'pointer', color: 'blue', marginBottom: '5px' }}>
              {answer}
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default Bot;
