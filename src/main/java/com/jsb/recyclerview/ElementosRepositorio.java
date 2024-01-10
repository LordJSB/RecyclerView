package com.jsb.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Aatrox", "Aatrox y sus hermanos, otrora respetados defensores de Shurima contra el Vacío, acabarían convirtiéndose en una amenaza aún mayor para Runaterra y solo conocieron la derrota ante el uso astuto de hechizos mortales."));
        elementos.add(new Elemento("Ahri", "Ahri es una raposa vastaya conectada de forma innata a la magia del reino de los espíritus. Es capaz de manipular las emociones de su presa antes de consumir su esencia, proceso que le transmite los recuerdos de cada alma que consume."));
        elementos.add(new Elemento("Akali", "Tras abandonar la orden de los Kinkou y su título de Puño de la Sombra, Akali actúa ahora en solitario y está lista para convertirse en el arma mortal que necesita su gente."));
        elementos.add(new Elemento("Akshan", "Impávido ante el peligro, Akshan combate el mal con gran carisma, ganas de impartir justa venganza y una evidente falta de camisetas. "));
        elementos.add(new Elemento("Alistar", "Alistar, un poderoso guerrero con una reputación temible, busca venganza por la muerte de su clan a manos del imperio noxiano. Aunque fue esclavizado y forzado a vivir como gladiador, fue su voluntad inquebrantable lo que le impidió convertirse en una verdadera bestia."));
        elementos.add(new Elemento("Amumu", "Cuenta la leyenda que Amumu es un alma solitaria y melancólica de la vieja Shurima que vaga por el mundo en busca de un amigo. Condenado por una maldición ancestral, su destino es permanecer solo para siempre, pues su tacto es muerte y su cariño, la perdición."));
        elementos.add(new Elemento("Anivia", "Anivia es un espíritu alado benevolente que soporta ciclos interminables de vida, muerte y nacimiento para proteger Freljord. Semidiosa nacida del hielo implacable y los vientos crueles, canaliza estos poderes elementales para anular a cualquiera que se atreva a perturbar su hogar."));
        elementos.add(new Elemento("Annie", "Peligrosa pero encantadoramente precoz, Annie es una pequeña maga con un inmenso poder piromántico. Incluso en los parajes montañosos al norte de Noxus es una hechicera sin precedentes."));
        elementos.add(new Elemento("Aphelios", "Aphelios emerge de entre las sombras de la noche con armas en mano y asesina a los enemigos de su fe en un silencio inquietante, hablando a tiro limpio únicamente a través de la certitud de su puntería."));
        elementos.add(new Elemento("Ashe", "Ashe, comandante hija del hielo de la tribu de Avarosa, lidera las hordas más numerosas del norte. Impasible, inteligente e idealista, aunque incómoda en su papel de líder, utiliza los poderes mágicos ancestrales de su linaje para empuñar un arco de Hielo Puro."));
        elementos.add(new Elemento("Aurelion Sol", "Aurelion Sol solía agraciar al vasto vacío del cosmos con las maravillas celestiales que él mismo ideaba. Ahora, se ve forzado a hacer uso de su increíble poder para satisfacer los deseos de un imperio espacial que lo ha engañado para convertirlo en su esclavo."));
        elementos.add(new Elemento("Azir", "Azir, emperador de Shurima en un pasado remoto, fue un hombre orgulloso que estuvo a punto de alcanzar la inmortalidad. Dominado por la arrogancia, fue traicionado y asesinado en la hora de su mayor triunfo, pero ahora, milenios después, ha renacido como un ser Ascendido de inmenso poder."));
        elementos.add(new Elemento("Bardo", "Bardo, un viajero de más allá de las estrellas, es un agente de la serendipia que lucha para mantener un equilibrio en el que la vida pueda soportar la indiferencia del caos. Muchos habitantes de Runaterra cantan canciones que hablan de su naturaleza extraordinaria, pero todos están de acuerdo en que el vagabundo cósmico se siente atraído por los artefactos de gran poder mágico."));
        elementos.add(new Elemento("Bel'veth", "Una emperatriz horripilante creada a partir de los materiales de la ciudad que devoró. Bel'Veth representa el mismísimo fin de Runaterra tal y como la conocemos... y marca el comienzo de una monstruosa realidad creada a su imagen y semejanza."));
        elementos.add(new Elemento("Blitzcrank", "Blitzcrank es un autómata enorme, casi indestructible, creado originalmente para el tratamiento de residuos tóxicos. Sin embargo, este propósito original le parecía demasiado restrictivo, así que se automodificó para servir mejor a los débiles del sumidero."));
        elementos.add(new Elemento("Brand", "Brand, antiguo miembro de la tribu Kegan Rodhe del helado Freljord, es una lección sobre la tentación de un poder mayor. En busca de una de las legendarias Runas Geogénicas, Kegan traicionó a sus compañeros y se quedó con la runa. El hombre desapareció al instante. Su alma se consumió y su cuerpo pasó a ser un recipiente de llamas vivas."));
        elementos.add(new Elemento("Braum", "Bendecido con bíceps enormes y un corazón aún más grande, Braum es un héroe muy apreciado en Freljord. Todas las tabernas al norte del Fuerte Helado brindan por su fuerza legendaria. Se dice que taló un bosque de robles en una sola noche y convirtió una montaña entera en escombros."));
        elementos.add(new Elemento("Briar", "La incontrolable sed de sangre que siente Briar, un experimento fallido de la Rosa Negra, la obliga a cargar con una picota especial que calma su enajenada mente. Tras años de confinamiento, esta arma viviente se ha librado de sus cadenas y se ha lanzado al mundo."));
        elementos.add(new Elemento("Caitlyn", "Reconocida como su mejor pacificadora, Caitlyn es también la mejor arma de Piltover para librar a la ciudad de sus elusivos elementos criminales. A menudo trabaja con Vi, y actúa como un frío y eficiente contrapunto para la naturaleza más impetuosa de su socia."));
        elementos.add(new Elemento("Camille", "Convertida en un arma viviente diseñada para operar fuera de la ley, Camille es la jefa de espías del clan Ferros, una elegante agente de élite que se asegura de que nada amenace el funcionamiento de Piltover ni de Zaun."));
        elementos.add(new Elemento("Cassiopeia", "Cassiopeia es una criatura mortal empeñada en manipular a otros según su siniestra voluntad. La hija más joven y hermosa de la noble familia Du Couteau de Noxus, se aventuró en lo más profundo de las criptas debajo de Shurima en busca de poder ancestral."));
        elementos.add(new Elemento("Cho'gath", "Desde el momento en que Cho'Gath emergió por primera vez a la dura luz solar de Runaterra, a la bestia solo le impulsaba el hambre más pura e insaciable. La perfecta expresión del deseo del Vacío de acabar con la vida, la compleja biología de Cho'Gath convierte rápidamente la materia en masa muscular, aumentando su densidad o endureciendo su caparazón externo como si fuese un diamante orgánico."));
        elementos.add(new Elemento("Corki", "El piloto yordle Corki adora dos cosas por encima de todas las demás: volar y su glamuroso bigote. Aunque no necesariamente en ese orden. Tras abandonar la Ciudad de Bandle, se estableció en Piltover y se enamoró de las máquinas maravillosas que allí encontró."));
        elementos.add(new Elemento("Darius", "No hay mayor símbolo del poder de Noxus que Darius, el comandante más temido y más curtido en batallas de toda la nación. Pasando de orígenes humildes a convertirse en la Mano de Noxus, se abre paso a tajos entre los enemigos del imperio, muchos de ellos noxianos."));
        elementos.add(new Elemento("Diana", "Portadora de una espada en forma de media luna, Diana es una guerrera de los Lunari, una fe rechazada en casi todas las tierras a los pies del Monte Targon. Ataviada con una armadura reluciente del color de la nieve en una noche de invierno, es la personificación del poder de la luna plateada."));
        elementos.add(new Elemento("Dr.Mundo", "Loco de remate, trágicamente homicida, terriblemente morado: el Dr. Mundo es lo que mantiene en sus casas a muchos habitantes de Zaun en las noches especialmente oscuras. Este autoproclamado doctor fue paciente del psiquiátrico más infame de Zaun."));
        elementos.add(new Elemento("Draven", "En Noxus, los guerreros conocidos como 'justicieros' se enfrentan en recintos donde corre la sangre y se pone a prueba la fortaleza. Pero ninguno ha alcanzado la fama de Draven, un antiguo soldado cuyo sentido del espectáculo y habilidad sin igual con las hachas giratorias son enormemente apreciados por la multitud."));
        elementos.add(new Elemento("Ekko", "Ekko, un prodigio surgido de las implacables calles de Zaun, manipula el tiempo para sacar ventaja de todas las situaciones. Con una máquina de su invención llamada Dispositivo Z, explora las distintas posibilidades de la realidad hasta alcanzar el momento ideal."));
        elementos.add(new Elemento("Elise", "Elise es una letal depredadora que mora en un palacio cerrado y sin luz situado en el corazón de la ciudad más antigua de Noxus. En su día fue una mujer mortal, señora de una casa poderosa, pero la picadura de un malvado semidiós la transformó en una criatura hermosa, inmortal y totalmente inhumana."));
        elementos.add(new Elemento("Evelynn", "En los oscuros adentros de Runaterra, el súcubo Evelynn deambula en busca de su siguiente víctima. Acecha a sus presas con una voluptuosa fachada femenina, pero cuando alguien sucumbe a sus encantos, Evelynn libera su auténtica forma."));
        elementos.add(new Elemento("Ezreal", "Ezreal, un aventurero aficionado a deslizarse y dotado de artes mágicas sin saberlo, saquea catacumbas perdidas, lidia con maldiciones ancestrales y supera con facilidad adversidades imposibles."));
        elementos.add(new Elemento("Fiddlesticks", "Algo ha despertado en Runaterra. Algo ancestral. Algo terrible. El horror conocido como Fiddlesticks acecha en las lindes de la sociedad, en las zonas en las que impera la paranoia, donde se alimenta de aquellos a los que aterroriza."));
        elementos.add(new Elemento("Fiora", "Fiora, la duelista más temida de Valoran, ha alcanzado renombre por su estilo brusco y su mente astuta, así como por la velocidad de su estoque. Fiora nació en el seno de la Casa Laurent, en el reino de Demacia, y asumió el control de la familia a raíz de un escándalo que casi acaba con ellos."));
        elementos.add(new Elemento("Fizz", "Fizz es un yordle anfibio que habita entre los arrecifes de alrededor de Aguas Estancadas. Suele recuperar y devolver los diezmos arrojados al mar por capitanes supersticiosos, pero incluso los marineros más agudos saben que no hay que plantarle cara, puesto que hay muchas historias que hablan sobre aquellos que han subestimado a este ser resbaladizo."));

    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}