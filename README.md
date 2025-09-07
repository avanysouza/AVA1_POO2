# Controle de Computadores – Loja de Vendas

## Descrição do Projeto

Este projeto foi desenvolvido como atividade da disciplina **"Programação Orientada a Objetos II"** da minha graduação em Sistemas de Informação. O objetivo é criar uma aplicação para gerenciamento de computadores de uma loja, incluindo **Desktops, Notebooks e Servidores**, aplicando conceitos de **Herança, Particionamento e Agregação** no desenvolvimento orientado a objetos.

Através do projeto, é possível cadastrar, consultar e manipular informações de diferentes modelos de computadores, garantindo controle sobre **quantidades em estoque, preços e características técnicas** de cada equipamento.

---

## Funcionalidades

- Gerenciamento de três tipos de computadores:  
  - **Desktop**  
  - **Notebook**  
  - **Servidor**
- Cadastro completo de cada modelo com atributos específicos de cada categoria.  
- Aplicação de **Herança e Agregação** para reaproveitamento de métodos e organização da hierarquia de classes.  
- Métodos principais implementados:  
  - **Construtores** (mínimo de 5 para cada classe principal)  
  - **Setters e Getters** para todos os atributos  
  - **Cadastrar**, **Entrada de Dados** e **Imprimir** informações de cada objeto  
- Suporte à criação de múltiplos objetos para cada tipo de computador, permitindo testes práticos de manipulação de dados.

---

## Estrutura do Projeto

O projeto segue uma hierarquia de classes organizada da seguinte forma:

- **Computador** (Superclasse)  
  - Desktop  
  - Notebook  
  - Servidor  

Cada classe possui atributos próprios, como **marca, preço, quantidade**, além de características específicas:  

- **Servidor**: Número de HDs, slots de memória, tipos de componentes, potência da fonte  
- **Notebook**: Monitor, memória, HD, fonte  
- **Desktop**: Placas de vídeo, monitor, memória, HD, fonte  

As classes foram planejadas usando **particionamento** (separação de atributos comuns e específicos), **agregação** (componentes como memória, HD, fonte) e **herança** (reuso de métodos e atributos comuns).

---

## Diagrama de Classes

O diagrama de classes ilustra a **hierarquia, herança e agregação** entre as classes do projeto:

<img width="3840" height="1932" alt="DiagramaPoo" src="https://github.com/user-attachments/assets/0132281c-6083-4b43-ba2d-18a13173aa31" />


O diagrama mostra a relação entre **Computador**, **Desktop**, **Notebook** e **Servidor**, bem como os atributos e métodos principais de cada classe.

---

## Tecnologias Utilizadas

- Linguagem de programação: Java
- IDE sugerida: IntelliJ IDEA 2024.2 (Ultimate Edition)

---

## Como Executar

1. Clone o repositório:  
   ```bash
   git clone https://github.com/avanysouza/AVA1_POO2
