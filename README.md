# projetoKafka

## Descrição
Este repositório contém o projeto "projetoKafka", que é uma Proof of Concept (PoC) para aplicação de conhecimentos sobre o Apache Kafka. O objetivo é demonstrar o uso do Kafka com tópicos (topic) e explorar conceitos como productor, broker e consumer. O projeto também utiliza Docker e Docker Compose para configurar o ambiente com Kafka e ZooKeeper, e a ferramenta Conduktor como interface gráfica para gerenciar o Kafka e o ZooKeeper.

## Tecnologias Utilizadas
- Apache Kafka
- Docker
- Docker Compose
- Conduktor
- API Rest com Spring Framework

## Requisitos do Sistema
- Docker instalado e configurado na máquina local.
- Docker Compose instalado e configurado na máquina local.

## Configuração do Ambiente
1. Clone este repositório: `git clone https://github.com/hvivox/projetoKafka.git`
2. Navegue até o diretório do projeto: `cd projetoKafka`

## Execução do Projeto
1. Certifique-se de ter o Docker e o Docker Compose instalados e configurados corretamente.
2. Execute o Docker Compose para configurar o ambiente com Kafka e ZooKeeper: `docker-compose up -d`
3. Utilize o Conduktor como interface gráfica para gerenciar o Kafka e o ZooKeeper.

## Utilização do Projeto
1. O projeto possui uma API Rest desenvolvida com Spring Framework.
2. A API envia mensagens para o broker do Kafka, que serão consumidas por outro serviço.
3. Explore os conceitos de productor, broker e consumer para entender o funcionamento do Kafka.

## Contribuição
Contribuições são bem-vindas! Se você quiser contribuir para este projeto, siga as etapas abaixo:
1. Faça um fork deste repositório.
2. Crie uma nova branch: `git checkout -b minha-branch`
3. Faça suas alterações e faça commit delas: `git commit -m 'Descrição das alterações'`
4. Envie para a branch original: `git push origin minha-branch`
5. Abra um pull request.

## Licença
Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).