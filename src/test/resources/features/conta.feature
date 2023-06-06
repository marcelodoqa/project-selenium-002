# language: pt

@CT002
Funcionalidade: Devo fazer alteracoes nas contas normalmente

  Cenário: Inserir uma conta
    Dado que estou na pagina de contas
    Quando insiro uma nova conta no campo vazio
    E clico em salvar
    Então devo ver a nova conta na lista de contas
    E receber um aviso de conta criada com sucesso