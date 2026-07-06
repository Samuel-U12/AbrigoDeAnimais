# AbrigoDeAnimais

### Intergrantes: Samuel Almeida de Lima, Fernando José Amurim Freitas, Mayane Cristina Lima Queiroz, Rhegys Patryck Oliveira Torres.

## 1. Descrição Geral do Problema e da Solução

### O Problema
No cenário atual, muitas Organizações Não Governamentais (ONGs) e abrigos voltados ao bem-estar animal enfrentam sérios problemas de gestão interna devido à falta de sistemas automatizados. O controle de animais disponíveis, históricos médicos, triagem de adotantes e a gestão financeira (envolvendo custos com alimentação e recursos humanos) costumam ser realizados de forma manual ou por meio de planilhas eletrônicas descentralizadas. Essa abordagem analógica resulta em perda de dados históricos, lentidão no processo de adoção, falhas no acompanhamento de vacinação e dificuldade em prever o orçamento mensal necessário para a manutenção do abrigo.

### A Solução
Para resolver esse problema, o grupo fez um Sistema de Gestão para Abrigo de Animais, usando Java e Orientação Objetos, fizemos o sistema no padrão arquitetural MVC. A solução automatiza todo o sistema do abrigo através de um programa java. O sistema permite o cadastro de animais (cachorros e gatos), funcionários (cuidadores e veterinários) e adotantes. Além de gerenciar o fluxo completo de adoção e atualizar em tempo real o status dos animais, o software conta com um sistema para calcular os custos mensais do abrigo de animais, além de gerenciar fichas médicas de cada animal.

---

## 2. Requisitos Funcionais (RF)

Os requisitos funcionais descrevem as ações e comportamentos que o sistema deve executar.

* **RF01 - Cadastrar Atores do Sistema:** O sistema deve permitir o cadastro de novos animais (identificando espécie, raça, peso e gerando um ID autoincrementado), funcionários (cuidadores com setor/turno e veterinários com CRM) e potenciais adotantes com validação de CPF único.
* **RF02 - Gerenciar Ficha Médica:** O sistema deve permitir que um funcionário do tipo Veterinário adicione registros de vacinas e observações clínicas à Ficha Médica individual de qualquer animal cadastrado no abrigo.
* **RF03 - Controlar Fluxo de Adoções:** O sistema deve permitir a realização de adoções vinculando o CPF de um adotante ao ID de um animal, alterando o status do animal de "Disponível" para "Adotado" e impedindo que animais já adotados passem pelo processo novamente.
* **RF04 - Emitir Relatórios e Consultas:** O sistema deve ser capaz de listar de forma filtrada todos os animais do abrigo, animais especificamente disponíveis, tipos de funcionários (veterinários ou cuidadores), adotantes, e permitir a busca individualizada de um animal por meio do seu ID único.
* **RF05 - Gerar Relatório Financeiro (Custo Mensal):** O sistema deve calcular de forma automatizada e polimórfica o custo mensal total do abrigo, somando os salários e benefícios dos funcionários com os custos individuais de alimentação (quilos de ração consumidos) e despesas veterinárias de cada animal resgatado.

## 3. Diagramas de Caso de Uso

![Diagrama de caso de uso](imgs/diagrama1.jpeg)

Este diagrama ilustra os diferentes estados que um objeto "Animal" pode assumir no sistema, como "Cadastrado", "Disponível" para adoção e "Adotado", detalhando as transições acionadas por eventos como "Cadastrar animal", "AdicionarVacina" e "adotarAnimal".

![Diagrama de caso de uso](imgs/diagrama2.jpeg)

Este diagrama apresenta as interações dos usuários do sistema com as funções de gerenciamento de pessoal e financeiro, incluindo o cadastro de funcionários especializados (Veterinário, Cuidador) e os cálculos de custo mensal, custo de animal e custo do abrigo.

![Diagrama de caso de uso](imgs/diagrama3.jpeg)

Este diagrama descreve como os usuários (especialmente Veterinários e Funcionários) interagem com o sistema para gerenciar as fichas médicas dos animais, realizando ações como adicionar vacinas, consultar fichas, atualizar observações e registrar gastos veterinários.

![Diagrama de Caso de Uso](imgs/diagrama4.jpeg)

Este diagrama mostra as interações gerais focadas nos animais, permitindo que os usuários realizem o cadastro de cachorros e gatos, gerenciem esses cadastros, procurem animais por ID e adicionem vacinas.

![Diagrama de caso de uso](imgs/diagrama5.jpeg)

Este diagrama detalha o fluxo e as interações para o processo de adoção, incluindo o cadastro de adotantes, a listagem de animais disponíveis e a execução da adoção em si, com verificação de disponibilidade e tratamento de exceções.

## 4. Diagramas de classes

![Diagrama de classes](imgs/diagrama6.jpeg)

Este é o diagrama de classes completo do sistema, apresentando a arquitetura geral organizada em pacotes (View, Control, Model), mostrando todas as classes principais (Main, View, Controller, Pessoa, Adotante, Funcionario, Veterinario, Cuidador, Animal, Cachorro, Gato, Ficha Medica) e suas relações (herança, associação, agregação, composição, implementação de interface).

![Diagrama de classes](imgs/diagrama7.jpeg)

Este diagrama de classes foca especificamente na relação entre as classes Adotante e Animal, mostrando uma associação onde um adotante pode ser responsável por múltiplos animais e um animal pode ter um adotante responsável

![Diagrama de classes](imgs/diagrama8.jpeg)

Este diagrama de classes foca na estrutura de herança da classe Funcionario, mostrando que as classes Cuidador e Veterinario estendem Funcionario, herdando seus atributos e métodos, e implementando seus próprios métodos específicos de cálculo de custo mensal.

