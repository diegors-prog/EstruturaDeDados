function Fila(tamanho) {
    let itens = []; //let itens = [10] = no javascript, por mais que indique o tamanho do array, ele sempre vai continuar adicionando enquanto tenha memória...
    const qtd = tamanho - 1;  //por isso uso a constante 'qtd' que recebe como parametro um valor, este valor servirá como flag apontando que este será o tamanho máximo do array  
    let topo = -1;
    let cont = 0;

    //função para validar se o array está cheio
    this.isFull = function() {
        if(topo>= qtd){
            return true;
        } else {
            return false;
        }
    }

    //função para validar se o array está vazio
    this.isEmpty = function() {
        if(topo === -1) {
            return true;
        } else {
            return false;
        }
    }

    //função para adicionar um item no final do array
    this.push = function(value) {
        if(this.isFull()) {
            console.log(`Array cheio!`);
        }else {
            itens[topo + 1] = value;
            topo++;
            cont++;
        }
    }

    //função para remover o primeiro item adicionado no array
    this.shift = function() {
        if(this.isEmpty()) {
            console.log(`Array vazio!`);
        }else {
            for(let i = 0; i < itens.length; i++) {
                itens[i] = itens[i + 1];
            }
            itens.length = itens.length - 1;
            topo--;
            cont--;
        }
    }

    //função para retornar o tamanho do array
    this.arrayLenght = function() {
        if(this.isEmpty()) {
            console.log(`Array vazio!`);
        }else {
            console.log(`Array possui ${cont} itens`);
        }
    }

    //função para printar os itens do array
    this.print = function() {
        if(this.isEmpty()) {
            console.log(`Array vazio!`);
        }else {
            itens.forEach((item) => {
                console.log(item);
            })
            this.arrayLenght();
        }    
    }
}

const fila = new Fila(5);

fila.print();

fila.push(10);
fila.push(5);
fila.push(8);
fila.push(2);
fila.push(4);

fila.print();

fila.shift();
fila.shift();

fila.print();

fila.push(9);
fila.push(6);

fila.print();

fila.push(11);

fila.print();