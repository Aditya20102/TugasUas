package com.adit.tugasuas.ui.profile;
//Aditya Mahendra Pamungkas 10120156 IF-4

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.adit.tugasuas.R;
import com.adit.tugasuas.activity.LoginActivity;


public class ProfileFragment extends Fragment {

    private Button btnLogout;
    private FirebaseAuth auth;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        auth = FirebaseAuth.getInstance();

        btnLogout = view.findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });
        return view;
    }

    private void logout() {
        auth.signOut();
        if (auth.getCurrentUser() == null) {
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            getActivity().finish();
            Toast.makeText(getActivity(), "Berhasil Logout", Toast.LENGTH_SHORT).show();
        }
    }
}