package lopezalos.joancarles.supermariojcla;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lopezalos.joancarles.supermariojcla.databinding.PersonajeDetallesBinding;

import java.util.ArrayList;


public class CharacterListFragment extends Fragment {

    private CharacterListFragmentBinding binding; //Binding para el layout
    private ArrayList<Personaje> character;
    private GameReciclerViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout del fragmento con binding
        binding = CharacterListFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        //Inicializamos la lista de personajes
        loadCharacters();

        //Configuramos el RecyclerView
        adapter = new GameRecyclerViewAdapter(character, getActivity());
        binding.gamesRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.gamesRecyclerview.setAdapter(adapter);
    }

    //Método para cargar personajes
    private void loadCharacters(){
        character = new ArrayList<Personaje>(); //El arraylist está hecho de objetos "Personaje"

        //Vamos a llenar la lista de los personajes que son:

        character.add(new Personaje(
            "Mario",
            "Héroe del reino Champiñón",
            "Fontanero amable y de buen corazón que vive en el Reino Champiñón. Se encarga de salvar a la gente, sobre todo a la princesa Peach a la cual ha rescatado incontables ocasiones del villano Bowser.",
             R.drawable.icon_mario
        ));

        character.add(new Personaje(
                "Luigi",
                "Héroe y eliminador de fantasmas",
                "Fontanero amable y de buen corazón. Algo más miedica que su hermano Mario, Luigi también está dispuesto a ayudar a quien haga falta, aunque eso termine llevándolo a mansiones encantadas o páramos hinóspitos.",
                R.drawable.iconLuigi
        ));

        character.add(new Personaje(
                "Princesa Peach",
                "Princesa del Reino Champiñón",
                "Gobierna el Reino Champiñón con amabilidad y mano firme. A menudo es raptada por Bowser, iniciando así la gran mayoría de las aventuras de los hermanos Mario y Luigi o de ella misma.",
                R.drawable.icon_peach
        ));

        character.add(new Personaje(
                "Toad",
                "Habitante del Reino Champiñón",
                "Personaje pacífico que habita el reino. Es amable y un poco infantil, aunque casi nunca se enfada. No dudará en ayudar a su princesa o sus amigos si la situación lo requiere.",
                R.drawable.icon_toad
        ));

        character.add(new Personaje(
                "Bowser",
                "Enemigo Nº1 del Reino",
                "Es el rey y el más poderoso de los Koopas. Vive en un enorme y peligroso castillo. Su objetivo es secuestrar a la Princesa Peach y dominar el Reino Champiñón, aunque sus planes siempre son arruinados por Mario.",
                R.drawable.icon_bowser
        ));
    }

}
