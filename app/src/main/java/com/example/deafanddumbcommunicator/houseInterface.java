package com.example.deafanddumbcommunicator;




import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link houseInterface#newInstance} factory method to
 * create an instance of this fragment.
 */
public class houseInterface extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Fragment fragment = null;

    private TextToSpeech textToSpeech;

    public houseInterface() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment houseInterface.
     */
    // TODO: Rename and change types and number of parameters
    public static houseInterface newInstance(String param1, String param2) {
        houseInterface fragment = new houseInterface();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.house_interface, container, false);

        CardView cardView1_h = v.findViewById(R.id.card_view1_h);
        CardView cardView2_h = v.findViewById(R.id.card_view2_h);
        CardView cardView3_h = v.findViewById(R.id.card_view3_h);
        CardView cardView4_h = v.findViewById(R.id.card_view4_h);
        CardView cardView5_h = v.findViewById(R.id.card_view5_h);
        CardView cardView6_h = v.findViewById(R.id.card_view6_h);
        CardView cardView7_h = v.findViewById(R.id.card_view7_h);
        CardView cardView8_h = v.findViewById(R.id.card_view8_h);
        CardView cardView9_h = v.findViewById(R.id.card_view9_h);
        CardView cardView10_h = v.findViewById(R.id.card_view10_h);
        CardView cardView11_h = v.findViewById(R.id.card_view11_h);
        CardView cardView12_h = v.findViewById(R.id.card_view12_h);



        cardView1_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });

        cardView2_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView3_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView4_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView5_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView6_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView7_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView8_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView9_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView10_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView11_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView12_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Hello", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });

        cardView1_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView2_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Panda");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView3_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView4_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView5_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView6_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView7_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView8_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView9_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView10_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView11_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView12_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });
        return v;
    }


}