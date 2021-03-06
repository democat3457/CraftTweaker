package crafttweaker.mc1120.events.handling;

import crafttweaker.api.event.INoteBlockEvent;
import net.minecraftforge.event.world.NoteBlockEvent;

public class MCNoteBlockEvent extends MCBlockEvent implements INoteBlockEvent {
    private NoteBlockEvent event;

    public MCNoteBlockEvent(NoteBlockEvent event) {
        super(event);
        this.event = event;
    }

    @Override
    public String getNote() {
        return event.getNote().toString();
    }

    @Override
    public void setNote(String note) {
        event.setNote(NoteBlockEvent.Note.valueOf(note.toUpperCase()), event.getOctave());
    }

    @Override
    public String getOctave() {
        return event.getOctave().toString();
    }

    @Override
    public void setOctave(String octave) {
        event.setNote(event.getNote(), NoteBlockEvent.Octave.valueOf(octave.toUpperCase()));
    }

    @Override
    public void setBoth(String note, String octave) {
        event.setNote(NoteBlockEvent.Note.valueOf(note.toUpperCase()), NoteBlockEvent.Octave.valueOf(octave.toUpperCase()));
    }

    @Override
    public int getNoteId() {
        return event.getVanillaNoteId();
    }
}