# 💱 Conversor de Moedas

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/Status-Concluído-green)
![License](https://img.shields.io/badge/License-MIT-blue)

## 📋 Sobre o Projeto

**Conversor de Moedas** é um desafio proposto pela **Alura** em parceria com o programa **Oracle Next Education (ONE)**. Este projeto consiste em uma aplicação de linha de comando desenvolvida em Java que consome a API ExchangeRate-API para realizar conversões de moedas em tempo real.

O objetivo principal é praticar conceitos fundamentais de Java como:
- Consumo de APIs REST
- Manipulação de JSON
- Tratamento de exceções
- Programação orientada a objetos
- Controle de versão com Git

## ✨ Funcionalidades

- Conversão entre diferentes moedas (USD, BRL, AOA e ARS.)
- Taxas de câmbio em tempo real
- Interface simples via terminal
  

## 🛠️ Tecnologias Utilizadas 

- **Java 17** - Linguagem principal
- **Maven** - Gerenciamento de dependências
- **ExchangeRate-API** - API de taxas de câmbio
- **Git/GitHub** - Controle de versão
- **VsCode

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior instalado
- Maven instalado
- Git (opcional, para clonar)

### 🔑 Configuração da API Key

**Importante:** Por questões de segurança, minha chave de API foi removida do repositório. Para executar o projeto, você precisará:

1. Acessar [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Criar uma conta gratuita
3. Gerar sua própria API Key
4. Substituir no código onde a chave é utilizada ( na classe ConversorService, método buscarTaxas... e depois seguir as instruções lá existentes)

### Passos para execução

```bash
# Clone o repositório
git clone https://github.com/KamaEduardo/conversor-moedas-java.git

# Entre no diretório
cd conversor-moedas-java

# Compile o projeto
mvn compile

# Execute a aplicação
mvn exec:java -Dexec.mainClass="ao.alurachallenge.Main"
```

### 📝 Licença

Este projeto está sob a licença MIT.


### 👨‍💻 Autor

Kama Eduardo
Formando na Oracle Next Education.
