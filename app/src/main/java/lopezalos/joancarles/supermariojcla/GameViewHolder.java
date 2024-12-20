package lopezalos.joancarles.supermariojcla;

import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder{
    private final GameCardviewBinding binding;

    public GameViewHolder (GameCardviewBinding binding){
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (Personaje personaje){
        binding.name.setText(personaje.getName());
        binding.description.setText(String.valueOf(personaje.getDescription()));
        binding.executePendingBindings();

    }

}
