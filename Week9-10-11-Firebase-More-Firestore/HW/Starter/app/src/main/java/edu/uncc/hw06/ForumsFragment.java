package edu.uncc.hw06;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import edu.uncc.hw06.databinding.FragmentForumsBinding;

public class ForumsFragment extends Fragment {

    public ForumsFragment() {
        // Required empty public constructor
    }

    FragmentForumsBinding binding;
    ArrayList<Fourm> mfourms = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentForumsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Forums");
        binding.buttonCreateForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.createNewForum();
            }
        });

        binding.buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.logout();
            }
        });

    }

    class FourmAdapter extends RecyclerView.Adapter<FourmAdapter.FourmViewHolder>{

        @NonNull
        @Override
        public FourmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Fourm
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull FourmViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {

            return mfourms.size();
        }

        class FourmViewHolder extends RecyclerView.ViewHolder{

            public FourmViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }


    ForumsListener mListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (ForumsListener) context;
    }

    interface ForumsListener {
        void createNewForum();
        void logout();
    }
}